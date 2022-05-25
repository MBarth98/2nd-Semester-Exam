package Application.BLL;

import Application.BE.*;
import Application.DAL.*;
import Application.GUI.Models.AccountModel;
import Application.GUI.Models.CitizenModel;

import java.nio.file.AccessDeniedException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TeacherDataManager extends StudentDataManager
{


    public TeacherDataManager()
    {

    }

    public Account createStudent(Account account) throws IllegalArgumentException, AccessDeniedException, SQLException
    {
        if (account == null)
        {
            throw new IllegalArgumentException("");

        } else
        {
            if (!account.getIsTeacher() && !account.getIsAdmin())
            {
                return accountDAO.createAccount(account);
            } else
            {
                throw new AccessDeniedException("");
            }
        }
    }

    public List<Account> getAllStudents() throws SQLException
    {
        List<Account> accountList = accountDAO.getAllAccounts();
        List<Account> studentList = new ArrayList<>();

        for (Account account: accountList)
        {
            if (!account.getIsTeacher() && !account.getIsAdmin())
            {
                studentList.add(account);
            }
        }

        return studentList;
    }

    public Account updateStudent(Account account) throws IllegalArgumentException, SQLException
    {
        if (!account.getIsTeacher() && !account.getIsAdmin())
        {
            accountDAO.updateAccount(account);
        } else
        {
            throw new IllegalArgumentException("");
        }

    }
    public void deleteStudent(Account account) throws IllegalArgumentException, SQLException
    {
        if (!account.getIsAdmin() && !account.getIsTeacher())
        {
            accountDAO.deleteAccount(account.getId());
        } else
        {
            throw new IllegalArgumentException("");
        }
    }

    public Citizen createCitizen(Citizen citizen)
    {
        if (citizen != null)
        {
            citizen.create
        }

    }

    public void deleteCitizen(Citizen citizen) throws IllegalArgumentException, SQLException
    {
        if (citizen != null)
        {
            citizenDAO.deleteCitizen(citizen.getId());
        } else
        {
            throw new IllegalArgumentException("");
        }

    }

    public void assignToCitizen(Account student, Citizen citizen) throws IllegalArgumentException, AccessDeniedException, SQLException
    {
        if (student != null && citizen != null)
        {
            throws new IllegalArgumentException("");
        } else
        {
            if (!student.getIsTeacher() && !student.getIsAdmin())
            {
                // FIXME: 25/05/2022 Use correct method from DAO
                assignedCitizenDAO.someDAOmethoc(student.getId(), citizen.getId());
            } else
            {
                throw new AccessDeniedException("");
            }
        }
    }

    public void removeFromCitizen(Account student, Citizen citizen) throws IllegalArgumentException, AccessDeniedException, SQLException
    {
        if (student != null && citizen != null)
        {
            throws new IllegalArgumentException("");
        } else
        {
            if (!student.getIsTeacher() && !student.getIsAdmin())
            {
                // FIXME: 25/05/2022 Use correct method from DAO
                assignedCitizenDAO.someDAOmethod(student.getId(), citizen.getId());
            } else
            {
                throw new AccessDeniedException("");
            }
        }
    }

}